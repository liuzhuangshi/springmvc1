package cap.mapper;

/**
 * @author 刘贤熔
 * @version 1.0.0
 * @createTIme 2018/9/17 10:55
 **/

import cap.model.Article;

import java.util.List;

public interface ArticleMapper {
    public Article selectByPrimaryKey(Integer id);

    public List<Article> selectAllArticle();

    public int deleteArticle(Integer id);

}