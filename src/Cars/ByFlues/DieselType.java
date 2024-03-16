package Cars.ByFlues;

import Cars.ByFlues.VehicleTypeByFuelTypes;
import Cars.VehicleTypeEnum;

public class DieselType extends VehicleTypeByFuelTypes {
    public DieselType() {
        super(VehicleTypeEnum.DIESEL.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
