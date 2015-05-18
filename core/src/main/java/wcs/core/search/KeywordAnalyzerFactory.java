package wcs.core.search;

import com.fatwire.cs.core.search.data.IndexRow;
import com.fatwire.cs.core.search.query.QueryExpression;
import com.fatwire.search.lucene.AnalyzerFactory;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.KeywordAnalyzer;

/**
 * Created by alemonge1 on 12/05/2015.
 */
public class KeywordAnalyzerFactory implements AnalyzerFactory {
    private final KeywordAnalyzer analyzer = new KeywordAnalyzer();

    @Override
    public Analyzer getAnalyserForQuery(QueryExpression queryExpression) {
        return analyzer;
    }

    @Override
    public Analyzer getAnalyzerForIndex() {
        return analyzer;
    }

    @Override
    public Analyzer getAnalyzerForIndexRow(IndexRow indexRow) {
        return analyzer;
    }
}
