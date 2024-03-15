package sleepjo.common;

public class ProductDTO {
    private int memberCode;
    private int code;
    private String name;
    private int price;
    private String description;

    public ProductDTO() {
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "memberCode=" + memberCode +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductDTO(int memberCode, int code, String name, int price, String description) {
        this.memberCode = memberCode;
        this.code = code;
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
