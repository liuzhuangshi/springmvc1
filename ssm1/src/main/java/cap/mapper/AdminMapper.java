package cap.mapper;

import cap.model.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 刘贤熔
 * @version 1.0.0
 * @createTIme 2018/9/17 15:02
 **/
@Repository
public interface AdminMapper {
    Admin selectById(Integer id);

    List<Admin> selectAll();

    int addAdmin(Admin admin);

    int updateAdmin(Admin admin);

    int deleteAdmin(Integer id);

    List<Admin> findByPage(@Param(value = "start") int start, @Param(value = "pageSize") int pageSize);

    int getTotalCount();
}
