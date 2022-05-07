public class ONU {
    private String gpon_sname;
    private String firmware_version;
    private String status;

    public ONU(String gpon_sname, String firmware_version, String status) {
        this.gpon_sname = gpon_sname;
        this.firmware_version = firmware_version;
        this.status = status;
    }

    public String getGpon_sname() {
        return gpon_sname;
    }

    public void setGpon_sname(String gpon_sname) {
        this.gpon_sname = gpon_sname;
    }

    public String getFirmware_version() {
        return firmware_version;
    }

    public void setFirmware_version(String firmware_version) {
        this.firmware_version = firmware_version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
