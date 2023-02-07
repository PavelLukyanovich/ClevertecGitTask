public class RemoveText {
    public String remove(String str) {
        String newStr;
        newStr = str.replace('!', ' ');
        return "New string is: " + newStr;
    }
}
