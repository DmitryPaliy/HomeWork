package home_work_7.decorator;

import home_work_7.api.ISearchEngine;

//4.3* Написать декоратор SearchEnginePunctuationNormalizer для ISearchEngine который будет удалять нежелательные
// символы. Любые знаки препинания, лишние пробелы и например переводы строк.
public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String noPunctuationText = text.replaceAll("(?U)[\\pP\\s]", " "); //на случай,если нет пробела.Совсем нет
        String editedText = noPunctuationText.replaceAll("\\s+", " ");
        return getSearchEngine().search(editedText, word);
    }

    public ISearchEngine getSearchEngine() {
        return searchEngine;
    }
}
