package cap.service;

import cap.model.Admin;
import cap.util.PageBean;

import java.util.List;

/**
 * @author 刘贤熔
 * @version 1.0.0
 * @createTIme 2018/9/17 15:10
 **/
public interface AdminService {
    Admin selectById(Integer id);

    List<Admin> selectAll();

    int addAdmin(Admin admin);

    int updateAdmin(Admin admin);

    int deleteAdmin(Integer id);

    PageBean findByPage(Integer pageNo, int pageSize);
}
