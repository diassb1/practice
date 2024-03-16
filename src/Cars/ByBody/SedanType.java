package Cars.ByBody;

import Cars.ByBody.VehicleTypeByBodyTypes;
import Cars.VehicleTypeEnum;

public class SedanType extends VehicleTypeByBodyTypes {
    public SedanType() {
        super(VehicleTypeEnum.SEDAN.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
