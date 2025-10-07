public class Codec {

    private final String BASE_URL = "http://tinyurl.com/";
    HashMap<String, String> map = new HashMap<>();
    private final String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private Random rand = new Random();
    private final int KEY_LENGTH = 6;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key;
        StringBuilder sb = new StringBuilder();

        do{
            for(int i=0;i<KEY_LENGTH;i++){
                sb.append(characters.charAt(rand.nextInt(characters.length())));
            }
            key = sb.toString();
        }while(map.containsKey(key));

        map.put(key,longUrl);

        return BASE_URL+key;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        
        String key = shortUrl.replace(BASE_URL,"");
        return map.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));