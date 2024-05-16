package home_work_7.decorator;
//4.4* Написать декоратор для ISearchEngine который будет позволять искать данные без учёта регистра.
import home_work_7.api.ISearchEngine;
import home_work_7.utils.RegExSearch;

public class SearchEngineIgnoringCase implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEngineIgnoringCase(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();
        return getSearchEngine().search(text, word);
    }

    public ISearchEngine getSearchEngine() {
        return searchEngine;
    }
}
