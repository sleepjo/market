package sleepjo.common;

public class PostDTO {
    private int code;
    private String title;
    private int productCode;

    public PostDTO() {
    }

    public PostDTO(int code, String title, int productCode) {
        this.code = code;
        this.title = title;
        this.productCode = productCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "PostDTO{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", productCode=" + productCode +
                '}';
    }
}
