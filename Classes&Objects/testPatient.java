public class testPatient extends patient {
    public static void main(String args[]){
        int id,blood,age;
        id = getId();
        blood = getBlood();
        age = getAge();
        patient obj = new patient(id,blood,age);
        obj.Display();
    }
}
