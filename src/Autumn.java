public enum Autumn {
    SEPTEMBER("окуу башталуучу ай"),
    OCTOBER("Куз мезгилинин 2 айы "),
    NOVEMBER("Куз мезгилинин акыркы айы");
    String information;

    Autumn(String information) {
        this.information = information;
    }

    public String getInformation() {
        return information;
    }
}
