public class ServiceStation {

    public void chek(Transport... transport) {
        for (Transport transport1 : transport) {
            transport1.servis();
        }
    }
}
