package Cars.ByPurpose;

import Cars.VehicleType;

public class VehicleTypeByPurpose extends VehicleType {
    public VehicleTypeByPurpose(String attribute) {
        super("Vehicle type by purpose");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByPurpose that = (VehicleTypeByPurpose) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
