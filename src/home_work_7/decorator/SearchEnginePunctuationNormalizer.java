package home_work_7.decorator;

import home_work_7.api.ISearchEngine;

//4.3* Написать декоратор SearchEnginePunctuationNormalizer для ISearchEngine который будет удалять нежелательные
// символы. Любые знаки препинания, лишние пробелы и например переводы строк.
public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;
    @Override
    public long search(String text, String simbol) {
        return 0;
    }
}
