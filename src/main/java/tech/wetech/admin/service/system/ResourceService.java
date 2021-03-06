package tech.wetech.admin.service.system;

import tech.wetech.admin.model.system.Resource;
import tk.mybatis.mapper.weekend.Weekend;

import java.util.List;
import java.util.Set;

public interface ResourceService {

    int createResource(Resource resource);

    int updateResource(Resource resource);

    void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);

    List<Resource> find(Weekend weekend);

    List<Resource> findAll();

    /**
     * 得到资源对应的权限字符串
     * @param resourceIds
     * @return
     */
    Set<String> findPermissions(Set<Long> resourceIds);

    /**
     * 根据用户权限得到菜单
     * @param permissions
     * @return
     */
    List<Resource> findMenus(Set<String> permissions);

}
