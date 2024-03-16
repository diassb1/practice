package Cars.ByFlues;

import Cars.ByFlues.VehicleTypeByFuelTypes;
import Cars.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuelTypes {
    public PetrolType() {
        super(VehicleTypeEnum.PETROL.name());
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
