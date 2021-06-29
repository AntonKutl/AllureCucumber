package enums;

public enum Sort {

    поУмолчанию("По умолчанию"),
    дешевле("Дешевле"),
    дороже("Дороже"),
    поДате(" По дате");

    public String value;

    public String getValue() {
        return value;
    }


    Sort(String value) {
        this.value = value;
    }
}
