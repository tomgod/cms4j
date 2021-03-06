package cn.im47.cms.common.entity.account;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 权限枚举.Resource Base Access Control中的资源定义.
 * <p/>
 * User: baitao.jibt@gmail.com
 * Date: 12-3-20
 * Time: 下午20:14
 */
public enum Permission {

    USER_CREATE("user:create", "新建用户"), USER_EDIT("user:update", "修改用户"),
    USER_SAVE("user:save", "保存用户"), USER_LIST("user:list", "查看用户"),

    GROUP_CREATE("group:create", "新建权限组"), GROUP_EDIT("group:update", "修改权限组"),
    GROUP_SAVE("group:save", "保存权限组"), GROUP_LIST("group:list", "查看权限组"),

    ARTICLE_CREATE("article:create", "新建文件"), ARTICLE_EDIT("article:update", "修改文件"),
    ARTICLE_SAVE("article:save", "保存文件"), ARTICLE_LIST("article:list", "查看文件"),

    ARCHIVE_CREATE("archive:create", "新建归档"), ARCHIVE_EDIT("archive:update", "修改归档"),
    ARCHIVE_SAVE("archive:save", "保存归档"), ARCHIVE_LIST("archive:list", "查看归档"),

    COMMENT_CREATE("comment:create", "新建留言"), COMMENT_EDIT("comment:update", "修改留言"),
    COMMENT_SAVE("comment:save", "保存留言"), COMMENT_LIST("comment:list", "查看留言"),

    GALLERY_CREATE("gallery:create", "新建相册"), GALLERY_EDIT("gallery:update", "修改相册"),
    GALLERY_SAVE("gallery:save", "保存相册"), GALLERY_LIST("gallery:list", "查看相册"),

    CATEGORY_CREATE("category:create", "新建分类"), CATEGORY_EDIT("category:update", "修改分类"),
    CATEGORY_SAVE("category:save", "保存分类"), CATEGORY_LIST("category:list", "查看分类"),

    LINK_CREATE("link:create", "新建链接"), LINK_EDIT("link:update", "修改链接"),
    LINK_SAVE("link:save", "保存链接"), LINK_LIST("link:list", "查看链接"),

    COURSE_CREATE("course:create", "新建课程"), COURSE_EDIT("course:update", "修改课程"),
    COURSE_SAVE("course:save", "保存课程"), COURSE_LIST("course:list", "查看课程"),

    AGENCY_CREATE("agency:create", "新建研究所"), AGENCY_EDIT("agency:update", "修改研究所"),
    AGENCY_SAVE("agency:save", "保存研究所"), AGENCY_LIST("agency:list", "查看研究所"),

    TEACHER_CREATE("teacher:create", "新建教师"), TEACHER_EDIT("teacher:update", "修改教师"),
    TEACHER_SAVE("teacher:save", "保存教师"), TEACHER_LIST("teacher:list", "查看教师");

    private static Map<String, Permission> valueMap = Maps.newHashMap();

    private String value;
    private String displayName;

    static {
        for (Permission permission : Permission.values()) {
            valueMap.put(permission.value, permission);
        }
    }

    Permission(String value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    public static Permission parse(String value) {
        return valueMap.get(value);
    }

    public String getValue() {
        return value;
    }

    public String getDisplayName() {
        return displayName;
    }
}