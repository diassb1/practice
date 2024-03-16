package Cars.ByPurpose;

import Cars.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {
    public TruckType() {
        super(VehicleTypeEnum.TRUCK.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
