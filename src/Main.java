public class Main {
    public static void main(String[] args) {

        //Teste Smartphone class
        SmartPhone myPhone = new SmartPhone("Galaxy s22", 50);

        System.out.println("Nome do dispositivo " + myPhone.getDeviceName());
        System.out.println("Nível de bateria inicial: " + myPhone.getBatteryLevel());
        myPhone.chargeBattery();
        System.out.println("Nível de bateria após carregar: " + myPhone.getBatteryLevel());

        myPhone.makeCall("123-452-7851");
        myPhone.printCallHistory();

        myPhone.sendMessage("123-452-7851", "Olá, tudo bem?");
        myPhone.printMessageHistory();

        //Teste Tablet class

        Tablet myTablet = new Tablet("iPad Pro", 80);

        System.out.println("Nome do dispositivo: " + myTablet.getDeviceName());
        System.out.println("Nível de bateria inicial: " + myTablet.getBatteryLevel());

        myTablet.chargeBattery();
        System.out.println("Nível de bateria após carregar: " + myTablet.getBatteryLevel());


        myTablet.sendMessage("987-654-3210", "Mensagem enviada de um tablet!");
        myTablet.printMessageHistory(); // Exibe o histórico de mensagens

    }
}