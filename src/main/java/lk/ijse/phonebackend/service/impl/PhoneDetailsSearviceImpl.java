package lk.ijse.phonebackend.service.impl;

import lk.ijse.phonebackend.dto.PhoneDetailsDto;
import lk.ijse.phonebackend.entity.PhoneDetails;
import lk.ijse.phonebackend.repository.PhoneDetailsRepository;
import lk.ijse.phonebackend.service.PhoneDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class PhoneDetailsSearviceImpl implements PhoneDetailsService {

//    @Autowired
//    private PhoneDetailsRepository phoneDetailsRepository;
//
//    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
//    public boolean savePhoneDetails(PhoneDetailsDto phoneDetailsDto) {
//        phoneDetailsRepository.save(new PhoneDetails(phoneDetailsDto.getBrand(),phoneDetailsDto.getName(),phoneDetailsDto.getPhoto(),phoneDetailsDto.getTechnolodgy(),phoneDetailsDto.getTwoGBands(),phoneDetailsDto.getThreeGBands(),phoneDetailsDto.getFourGBands(),phoneDetailsDto.getSpeed(),phoneDetailsDto.getGprs(),phoneDetailsDto.getEdge(),phoneDetailsDto.getAnnounced(),phoneDetailsDto.getStatus(),phoneDetailsDto.getDimentions(),phoneDetailsDto.getWeight(),phoneDetailsDto.getSim(),phoneDetailsDto.getType(),phoneDetailsDto.getSize(),phoneDetailsDto.getResolution(),phoneDetailsDto.getMultitouch(),phoneDetailsDto.getEmui(),phoneDetailsDto.getOs(),phoneDetailsDto.getChipset(),phoneDetailsDto.getCpu(),phoneDetailsDto.getGpu(),phoneDetailsDto.getCardslot(),phoneDetailsDto.getInternal(),phoneDetailsDto.getMainCamfeatures(),phoneDetailsDto.getMainCamVideos(),phoneDetailsDto.getSelfiCamFeatures(),phoneDetailsDto.getSelfieCamVideos(),phoneDetailsDto.getAlertType(),phoneDetailsDto.getLoudspeaker(),phoneDetailsDto.getLack(),phoneDetailsDto.getWlan(),phoneDetailsDto.getBluetooth(),phoneDetailsDto.getGps(),phoneDetailsDto.getRadio(),phoneDetailsDto.getUsb(),phoneDetailsDto.getSensorsMessaging(),phoneDetailsDto.getBrowser(),phoneDetailsDto.getColor(),phoneDetailsDto.getOther()));
//        return true;
//    }
//
//    @Override
//    public List<PhoneDetailsDto> getallPhoneDetails() {
//        List<PhoneDetails> all = phoneDetailsRepository.findAll();
//        List<PhoneDetailsDto>dtoList=new ArrayList<>();
//        all.forEach(phoneDetails -> {
//            dtoList.add(new PhoneDetailsDto(phoneDetails.getBrand(),phoneDetails.getName(),phoneDetails.getPhoto(),phoneDetails.getTechnolodgy(),phoneDetails.getTwoGBands(),phoneDetails.getThreeGBands(),phoneDetails.getFourGBands(),phoneDetails.getSpeed(),phoneDetails.getGprs(),phoneDetails.getEdge(),phoneDetails.getAnnounced(),phoneDetails.getStatus(),phoneDetails.getDimentions(),phoneDetails.getWeight(),phoneDetails.getSim(),phoneDetails.getType(),phoneDetails.getSize(),phoneDetails.getResolution(),phoneDetails.getMultitouch(),phoneDetails.getEmui(),phoneDetails.getOs(),phoneDetails.getChipset(),phoneDetails.getCpu(),phoneDetails.getGpu(),phoneDetails.getCardslot(),phoneDetails.getInternal(),phoneDetails.getMainCamfeatures(),phoneDetails.getMainCamVideos(),phoneDetails.getSelfiCamFeatures(),phoneDetails.getSelfieCamVideos(),phoneDetails.getAlertType(),phoneDetails.getLoudspeaker(),phoneDetails.getLack(),phoneDetails.getWlan(),phoneDetails.getBluetooth(),phoneDetails.getGps(),phoneDetails.getRadio(),phoneDetails.getUsb(),phoneDetails.getSensorsMessaging(),phoneDetails.getBrowser(),phoneDetails.getColor(),phoneDetails.getOther()));
//        });
//        return dtoList;
//    }
//
//    @Override
//    public PhoneDetailsDto findphonedetails(String id) {
//        return null;
//    }
//
//    @Override
//    public long getTotalPhoneDetails() {
//        return 0;
//    }



    @Autowired
    private PhoneDetailsRepository phoneDetailsRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void savePhoneDetails(PhoneDetailsDto phoneDetailsDto) {
        phoneDetailsRepository.save(new PhoneDetails(phoneDetailsDto.getBrand(),phoneDetailsDto.getName(),phoneDetailsDto.getPhoto(),phoneDetailsDto.getTechnolodgy(),phoneDetailsDto.getTwoGBands(),phoneDetailsDto.getThreeGBands(),phoneDetailsDto.getFourGBands(),phoneDetailsDto.getSpeed(),phoneDetailsDto.getGprs(),phoneDetailsDto.getEdge(),phoneDetailsDto.getAnnounced(),phoneDetailsDto.getStatus(),phoneDetailsDto.getDimentions(),phoneDetailsDto.getWeight(),phoneDetailsDto.getSim(),phoneDetailsDto.getType(),phoneDetailsDto.getSize(),phoneDetailsDto.getResolution(),phoneDetailsDto.getMultitouch(),phoneDetailsDto.getEmui(),phoneDetailsDto.getOs(),phoneDetailsDto.getChipset(),phoneDetailsDto.getCpu(),phoneDetailsDto.getGpu(),phoneDetailsDto.getCardslot(),phoneDetailsDto.getInternal(),phoneDetailsDto.getMainCamfeatures(),phoneDetailsDto.getMainCamVideos(),phoneDetailsDto.getSelfiCamFeatures(),phoneDetailsDto.getSelfieCamVideos(),phoneDetailsDto.getAlertType(),phoneDetailsDto.getLoudspeaker(),phoneDetailsDto.getLack(),phoneDetailsDto.getWlan(),phoneDetailsDto.getBluetooth(),phoneDetailsDto.getGps(),phoneDetailsDto.getRadio(),phoneDetailsDto.getUsb(),phoneDetailsDto.getSensorsMessaging(),phoneDetailsDto.getBrowser(),phoneDetailsDto.getColor(),phoneDetailsDto.getOther()));
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updatePhoneDetails(PhoneDetailsDto phoneDetailsDto) {
        phoneDetailsRepository.save(new PhoneDetails(phoneDetailsDto.getBrand(),phoneDetailsDto.getName(),phoneDetailsDto.getPhoto(),phoneDetailsDto.getTechnolodgy(),phoneDetailsDto.getTwoGBands(),phoneDetailsDto.getThreeGBands(),phoneDetailsDto.getFourGBands(),phoneDetailsDto.getSpeed(),phoneDetailsDto.getGprs(),phoneDetailsDto.getEdge(),phoneDetailsDto.getAnnounced(),phoneDetailsDto.getStatus(),phoneDetailsDto.getDimentions(),phoneDetailsDto.getWeight(),phoneDetailsDto.getSim(),phoneDetailsDto.getType(),phoneDetailsDto.getSize(),phoneDetailsDto.getResolution(),phoneDetailsDto.getMultitouch(),phoneDetailsDto.getEmui(),phoneDetailsDto.getOs(),phoneDetailsDto.getChipset(),phoneDetailsDto.getCpu(),phoneDetailsDto.getGpu(),phoneDetailsDto.getCardslot(),phoneDetailsDto.getInternal(),phoneDetailsDto.getMainCamfeatures(),phoneDetailsDto.getMainCamVideos(),phoneDetailsDto.getSelfiCamFeatures(),phoneDetailsDto.getSelfieCamVideos(),phoneDetailsDto.getAlertType(),phoneDetailsDto.getLoudspeaker(),phoneDetailsDto.getLack(),phoneDetailsDto.getWlan(),phoneDetailsDto.getBluetooth(),phoneDetailsDto.getGps(),phoneDetailsDto.getRadio(),phoneDetailsDto.getUsb(),phoneDetailsDto.getSensorsMessaging(),phoneDetailsDto.getBrowser(),phoneDetailsDto.getColor(),phoneDetailsDto.getOther()));
    }

    @Override
    public void deletePhoneDetails(String name) {
        phoneDetailsRepository.deleteById(name);
    }

    @Override
    public PhoneDetailsDto findPhoneDetails(String name) {
        PhoneDetails phoneDetailsDto= phoneDetailsRepository.findById(name).get();
        return new PhoneDetailsDto(phoneDetailsDto.getBrand(),phoneDetailsDto.getName(),phoneDetailsDto.getPhoto(),phoneDetailsDto.getTechnolodgy(),phoneDetailsDto.getTwoGBands(),phoneDetailsDto.getThreeGBands(),phoneDetailsDto.getFourGBands(),phoneDetailsDto.getSpeed(),phoneDetailsDto.getGprs(),phoneDetailsDto.getEdge(),phoneDetailsDto.getAnnounced(),phoneDetailsDto.getStatus(),phoneDetailsDto.getDimentions(),phoneDetailsDto.getWeight(),phoneDetailsDto.getSim(),phoneDetailsDto.getType(),phoneDetailsDto.getSize(),phoneDetailsDto.getResolution(),phoneDetailsDto.getMultitouch(),phoneDetailsDto.getEmui(),phoneDetailsDto.getOs(),phoneDetailsDto.getChipset(),phoneDetailsDto.getCpu(),phoneDetailsDto.getGpu(),phoneDetailsDto.getCardslot(),phoneDetailsDto.getInternal(),phoneDetailsDto.getMainCamfeatures(),phoneDetailsDto.getMainCamVideos(),phoneDetailsDto.getSelfiCamFeatures(),phoneDetailsDto.getSelfieCamVideos(),phoneDetailsDto.getAlertType(),phoneDetailsDto.getLoudspeaker(),phoneDetailsDto.getLack(),phoneDetailsDto.getWlan(),phoneDetailsDto.getBluetooth(),phoneDetailsDto.getGps(),phoneDetailsDto.getRadio(),phoneDetailsDto.getUsb(),phoneDetailsDto.getSensorsMessaging(),phoneDetailsDto.getBrowser(),phoneDetailsDto.getColor(),phoneDetailsDto.getOther());

    }

    @Override
    public List<PhoneDetailsDto> findAllPhoneDetails() {
        List<PhoneDetails> allPhones = phoneDetailsRepository.findAll();
        List<PhoneDetailsDto> dtos = new ArrayList<>();
        allPhones.forEach(phoneDetailsDto -> dtos.add(new PhoneDetailsDto(phoneDetailsDto.getBrand(),phoneDetailsDto.getName(),phoneDetailsDto.getPhoto(),phoneDetailsDto.getTechnolodgy(),phoneDetailsDto.getTwoGBands(),phoneDetailsDto.getThreeGBands(),phoneDetailsDto.getFourGBands(),phoneDetailsDto.getSpeed(),phoneDetailsDto.getGprs(),phoneDetailsDto.getEdge(),phoneDetailsDto.getAnnounced(),phoneDetailsDto.getStatus(),phoneDetailsDto.getDimentions(),phoneDetailsDto.getWeight(),phoneDetailsDto.getSim(),phoneDetailsDto.getType(),phoneDetailsDto.getSize(),phoneDetailsDto.getResolution(),phoneDetailsDto.getMultitouch(),phoneDetailsDto.getEmui(),phoneDetailsDto.getOs(),phoneDetailsDto.getChipset(),phoneDetailsDto.getCpu(),phoneDetailsDto.getGpu(),phoneDetailsDto.getCardslot(),phoneDetailsDto.getInternal(),phoneDetailsDto.getMainCamfeatures(),phoneDetailsDto.getMainCamVideos(),phoneDetailsDto.getSelfiCamFeatures(),phoneDetailsDto.getSelfieCamVideos(),phoneDetailsDto.getAlertType(),phoneDetailsDto.getLoudspeaker(),phoneDetailsDto.getLack(),phoneDetailsDto.getWlan(),phoneDetailsDto.getBluetooth(),phoneDetailsDto.getGps(),phoneDetailsDto.getRadio(),phoneDetailsDto.getUsb(),phoneDetailsDto.getSensorsMessaging(),phoneDetailsDto.getBrowser(),phoneDetailsDto.getColor(),phoneDetailsDto.getOther())));
        return dtos;
    }


}

