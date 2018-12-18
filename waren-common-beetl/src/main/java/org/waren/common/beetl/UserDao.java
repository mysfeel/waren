/**
 * 
 */
package org.waren.common.beetl;

import java.util.List;

import org.beetl.sql.core.mapper.BaseMapper;
import org.waren.common.pojo.User;

/**
 * @author think
 *
 */
public interface UserDao extends BaseMapper<User> {

	List<User> select(String name);
}
