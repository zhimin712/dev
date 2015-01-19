package junit;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.my.common.model.SysRoles;
import com.my.common.model.SysUsers;
import com.my.common.plugin.PageInfo;
import com.my.menu.model.MenuModel;
import com.my.menu.service.MenuService;
import com.my.role.service.RoleService;
import com.my.user.service.UserService;
import com.my.utils.CalendarUtil;
import com.my.utils.MD5;
import com.my.utils.UUIDGenerator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:applicationContext-mvc.xml", "classpath:applicationContext-base.xml" })
public class Junit_admin {

	@Autowired
	private UserService userService;
	// @Autowired
	private RoleService roleService;
	// @Autowired
	private MenuService menuService;

	Map<String, Object> result;
	Gson gson;
	List<?> list;

	// @Test
	public void uuid() {
		System.out.println(UUIDGenerator.generate());
	}

	// @Test
	public void calendar() {
		List<Date> list = CalendarUtil.getDateSection();
		for (Date date : list) {
			System.out.println(CalendarUtil.getLongDate(date));
		}
	}

	// @Test
	public void menu() {
		List<MenuModel> menus = menuService.findAll(null);
		System.out.println(menus.size());
		for (MenuModel menu : menus) {
			System.out.println(json(menu.getSubMenu()));
		}
		System.out.println(json(menus));

	}

	@Test
	public void userRoles() {
		SysUsers user = userService.findByName("abc");
		System.out.println(json(user));
	}

	// @Test
	public void user() {
		SysUsers user = new SysUsers();
		user.setUserId(UUIDGenerator.generate());
		user.setUsername("abc");
		user.setPassword("abc");
		user.setName("管理员");
		user.setEnabled("1");
		userService.save(user);
		user = userService.findByNameAndPassword("abc", "abc");
		System.out.println(user.getCreateTime());
	}

	// @Test
	public void users() {
		PageInfo<SysUsers> page = userService.getPage(1, 10);
		System.out.println(json(page.getList()));
	}

	// @Test
	public void role() {
		SysRoles role = new SysRoles();
		role.setRoleId(UUIDGenerator.generate());
		role.setRoleName("普通用户");
		role.setRoleDesc("普通用户");
		role.setEnabled("1");
		role.setIsSys("0");
		roleService.save(role);
		// role = service.findByNameAndPassword("abc", "abc");
	}

	// @Test
	public void addUserRole() {
		roleService.addUserRole("818181ec4ad46274014ad46274080000", "818181ec4ad85c9a014ad85c9ad60000");
		// role = service.findByNameAndPassword("abc", "abc");
	}

	// @Test
	public void md5() {
		String s1 = "abc";
		System.out.println("原始：" + s1);
		System.out.println("MD5后：" + MD5.encode(s1));
		System.out.println("MD5后再加密：" + MD5.KL(MD5.encode(s1)));
		System.out.println("解密为MD5后的：" + MD5.JM(MD5.KL(MD5.encode(s1))));
		System.out.println("解密为MD5后的值：" + MD5.JM(MD5.JM(s1)));// 一次加密两次解密
	}

	public String json(Object object) {
		GsonBuilder gb = new GsonBuilder();
		gb.excludeFieldsWithoutExposeAnnotation();
		// gson = gb.create();
		gson = new Gson();
		return gson.toJson(object);
	}

}