@Grapes(
    @Grab(group='org.jsoup', module='jsoup', version='1.13.1')
)
import org.jsoup.*
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

println 'Start';

//String cleanedText = Jsoup.parse("<p>Моя кошка очень раздражена</p>").text()
org.jsoup.nodes.Document document = Jsoup.connect("https://hh.ru/").get();
println document.class

//def div = document.select("div");
//println div
def a = document.select("a")
println a.first()
println ""
println a.first().outerHtml();
println ""
println a.first().attr("href");