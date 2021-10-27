public class Vehicle {
    int mId;
    String mName;
    int mMaxSpeed;
    Vehicle(int id, String name, int maxSpeed){
        mId = id;
        mName = name;
        mMaxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "mã: " + mId + " - " + "tên: "+ mName + " - " + "vận tốc tối đa: "+ mMaxSpeed + " km/h";
    }
}
