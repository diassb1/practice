package Cars.ByBody;

import Cars.VehicleTypeEnum;

public class TruckType extends VehicleTypeByBodyTypes {
    public TruckType() {
        super(VehicleTypeEnum.TRUCK.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
