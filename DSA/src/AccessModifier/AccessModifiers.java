package AccessModifier;

public class AccessModifiers {
    public String name;
    public String email;
    protected String maritalDetails;
    private long bankId=9944;
    private int bankPassword=9030;

    public long getBankId() {
        return bankId;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }

    public int getBankPassword() {
        return bankPassword;
    }

    public void setBankPassword(int bankPassword) {
        this.bankPassword = bankPassword;
    }

    AccessModifiers(String name, String email){
        this.name=name;
        this.email=email;
    }
    public static void showDetails(AccessModifiers acc){
        System.out.print("Name:"+acc.name+"\nemail:"+acc.email+"\nMartialDetails:"+acc.maritalDetails+"\nBankId:"+acc.bankId+"\nBankPassword:"+acc.bankPassword);
    }
}
