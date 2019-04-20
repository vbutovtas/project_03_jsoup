import java.io.File;
import java.io.IOException;
import java.util.*;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String args[]) {

        List<Rec> results=new ArrayList<Rec>();
        Map<String,List<Rec>> res=new HashMap<String,List<Rec>>();
        res.put("results",results);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество товаров");
        int n = scan.nextInt();

        // JSoup Example 2 - Reading HTML page from URL
        try {
            for(int i=0;i<Math.ceil(n/125.0);i++) {
                String url="https://www.scalemates.com/search.php?q=*&sortby=date&page=news&fkSECTION[]=Kits&fkYEAR[]=2017&fkYEAR[]=2018&fkYEAR[]=2019&mode=ajax&start="+(i*125+1)+"&df=ok";
                Document doc = Jsoup.connect(url).get();
                results.addAll(Parser.parseDoc(doc, n-i*125));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        String string = gson.toJson(res);
        WriteAndReadJSON json=new WriteAndReadJSON();
        json.writeToJson(string);
        System.out.println(string.replace("},{","},\n{").replace("\",\"","\",\n\""));



    }
}
