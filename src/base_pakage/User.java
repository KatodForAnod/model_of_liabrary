package base_pakage;

public class User {
    private String name;
    private String infAboutUser;
    private String dataRegistration;
    private Boolean isAuthorized;
    private Long id;

    public User() {
        isAuthorized = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfAboutUser() {
        return infAboutUser;
    }

    public void setInfAboutUser(String infAboutUser) {
        this.infAboutUser = infAboutUser;
    }

    public String getDataRegistration() {
        return dataRegistration;
    }

    public void setDataRegistration(String dataRegistration) {
        this.dataRegistration = dataRegistration;
    }

    public Boolean getAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(Boolean authorized) {
        isAuthorized = authorized;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
