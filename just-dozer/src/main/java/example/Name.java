package example;

public class Name {

    private String first;
    private String last;
    private String prefix;
    private String suffix;
    
    
    public String getFirst() {
        return first;
    }
    public void setFirst(String first) {
        this.first = first;
    }
    public String getLast() {
        return last;
    }
    public void setLast(String last) {
        this.last = last;
    }
    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public String getSuffix() {
        return suffix;
    }
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
    public String toString() {
        return "first: " + first
                + "\nlast: " + last
                + "\nprefix: " + prefix
                + "\nsuffix: " + suffix;
    }
}
