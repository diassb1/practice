package Cars.ByPurpose;

import Cars.VehicleTypeEnum;

public class PassengerType extends VehicleTypeByPurpose {

    public PassengerType() {
        super(VehicleTypeEnum.PASSENGER.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}
