package Cars;


import Cars.ByBody.PickupType;
import Cars.ByBody.SedanType;
import Cars.ByFlues.DieselType;
import Cars.ByFlues.PetrolType;
import Cars.ByPurpose.PassengerType;
import Cars.ByPurpose.TruckType;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());
        VehicleAd zil = new VehicleAd("Zil", "45", new TruckType(),
                new Cars.ByBody.TruckType(), new DieselType());


        adsService.setAdList(new VehicleAd[]{volvoAd, zil});

//    adsService.filterByVehicleTypeByPurpose(new PassengerType());
//
//    adsService.filterByVehicleTypeByPurpose(new TruckType());
//
//    adsService.filterByVehicleTypeByBodyTypes(new Cars.ByBody.TruckType());

        adsService.filterByVehicleTypeByFuelTypes(new Cars.ByFlues.DieselType());


        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом

    }

}
