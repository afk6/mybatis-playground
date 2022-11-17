package sh.now.afk.playground.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {
    @Select("<script>select #{a} <if test = 'a != null and a != \"\" and a != \" \" and a != \"K\"  '> + 75 </if></script>")
    Integer echo(Integer a);

    @Select("<script>select #{a} <if test = \"a != null and a != '' and a != ' ' and a != 'a' and a != '747576' and a != 'K'  \"> + 75 </if></script>")
    Integer echo2(Integer a);
}
