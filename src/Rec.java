public class Rec {
    private String url;
    private String brand;
    private String brandCatno;
    private String name;
    private String scale;
    private String description;
    private String boxartUrl;
    private String year;


    public Rec(String url, String brand, String brandCatno, String name, String scale, String description, String boxartUrl, String year) {
        this.url = url;
        this.brand = brand;
        this.brandCatno = brandCatno;
        this.name = name;
        this.scale = scale;
        this.description = description;
        this.boxartUrl = boxartUrl;
        this.year = year;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBrandCatno(String brandCatno) {
        this.brandCatno = brandCatno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBoxartUrl(String boxartUrl) {
        this.boxartUrl = boxartUrl;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getUrl() {
        return url;
    }

    public String getBrand() {
        return brand;
    }

    public String getBrandCatno() {
        return brandCatno;
    }

    public String getName() {
        return name;
    }

    public String getScale() {
        return scale;
    }

    public String getDescription() {
        return description;
    }

    public String getBoxartUrl() {
        return boxartUrl;
    }

    public String getYear() {
        return year;
    }
}
