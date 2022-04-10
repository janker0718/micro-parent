/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50735
 Source Host           : 127.0.0.1:3306
 Source Schema         : jmall

 Target Server Type    : MySQL
 Target Server Version : 50735
 File Encoding         : 65001

 Date: 10/04/2022 23:03:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for lms_logistics_order
-- ----------------------------
DROP TABLE IF EXISTS `lms_logistics_order`;
CREATE TABLE `lms_logistics_order` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `waybill_sn` varchar(64) NOT NULL COMMENT '运单编号',
  `status` int(1) NOT NULL COMMENT '运单状态',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for mms_merchant
-- ----------------------------
DROP TABLE IF EXISTS `mms_merchant`;
CREATE TABLE `mms_merchant` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `name` varchar(64) NOT NULL COMMENT '商户名',
  `verify_status` int(10) NOT NULL COMMENT '审核状态',
  `business_license` varchar(64) NOT NULL COMMENT '营业执照号',
  `business_license_pic` varchar(255) NOT NULL DEFAULT '' COMMENT '营业执照照片',
  `legal_person` varchar(32) NOT NULL COMMENT '法人',
  `legal_person_id_card` varchar(32) NOT NULL COMMENT '法人身份证号',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for mms_shop
-- ----------------------------
DROP TABLE IF EXISTS `mms_shop`;
CREATE TABLE `mms_shop` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `merchant_id` int(10) NOT NULL COMMENT '商户id',
  `name` varchar(64) NOT NULL COMMENT '店铺名称',
  `logo` varchar(64) NOT NULL COMMENT 'logo',
  `describe` varchar(255) NOT NULL COMMENT '描述',
  `verify_status` int(1) NOT NULL COMMENT '审核状态',
  `delete_status` int(1) NOT NULL COMMENT '删除状态',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for mms_shop_product_img
-- ----------------------------
DROP TABLE IF EXISTS `mms_shop_product_img`;
CREATE TABLE `mms_shop_product_img` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `shop_id` int(10) NOT NULL COMMENT '店铺id',
  `url` varchar(255) NOT NULL COMMENT '图片url',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for oms_order
-- ----------------------------
DROP TABLE IF EXISTS `oms_order`;
CREATE TABLE `oms_order` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `order_sn` varchar(64) NOT NULL COMMENT '订单编号',
  `total_amount` decimal(10,2) NOT NULL COMMENT '订单总金额',
  `pay_amount` decimal(10,2) NOT NULL COMMENT '支付金额',
  `freight_amount` decimal(10,2) NOT NULL COMMENT '运费',
  `pay_order_sn` varchar(64) NOT NULL COMMENT '支付单号',
  `source_type` int(10) NOT NULL COMMENT '订单来源',
  `status` int(1) NOT NULL COMMENT '订单状态',
  `delivery_sn` varchar(64) NOT NULL COMMENT '配送单编号',
  `auto_confirm_day` int(10) NOT NULL COMMENT '自动确认天数',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for oms_order_item
-- ----------------------------
DROP TABLE IF EXISTS `oms_order_item`;
CREATE TABLE `oms_order_item` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `order_id` int(10) NOT NULL COMMENT '订单id',
  `shop_id` int(10) NOT NULL COMMENT '店铺id',
  `order_sn` varchar(64) NOT NULL COMMENT '订单编号',
  `product_sku_id` int(10) NOT NULL COMMENT '商品sku id',
  `product_id` int(10) NOT NULL COMMENT '商品id',
  `product_sku_code` varchar(255) NOT NULL COMMENT '商品sku code',
  `product_price` decimal(10,2) NOT NULL COMMENT '商品价格',
  `goods_quantity` int(10) NOT NULL COMMENT '物品件数',
  `pay_amount` decimal(10,2) NOT NULL COMMENT '实付金额',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for oms_refund_order
-- ----------------------------
DROP TABLE IF EXISTS `oms_refund_order`;
CREATE TABLE `oms_refund_order` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `order_id` int(10) NOT NULL COMMENT '订单id',
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `order_sn` varchar(64) NOT NULL COMMENT '退款订单编号',
  `shop_id` int(10) NOT NULL COMMENT '店铺id',
  `delivery_sn` varchar(64) NOT NULL COMMENT '配送编号',
  `status` int(1) NOT NULL COMMENT '状态',
  `transfer_province` varchar(64) NOT NULL COMMENT '发货省份',
  `transfer_city` varchar(64) NOT NULL COMMENT '发货城市',
  `transfer_area` varchar(64) NOT NULL COMMENT '发货地区',
  `transfer_detail_address` varchar(128) NOT NULL COMMENT '发货详细地址',
  `transfer_name` varchar(64) NOT NULL COMMENT '发货人手机号',
  `transfer_phone` varchar(64) NOT NULL COMMENT '发货人手机号',
  `receive_province` varchar(64) NOT NULL COMMENT '收货省份',
  `receive_city` varchar(64) NOT NULL COMMENT '收货城市',
  `receive_area` varchar(64) NOT NULL COMMENT '收货地区',
  `receive_detail_address` varchar(128) NOT NULL COMMENT '收货详细地址',
  `receive_name` varchar(64) NOT NULL COMMENT '收货人名字',
  `receive_phone` varchar(64) NOT NULL COMMENT '收货人人手机号',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for oms_refund_order_item
-- ----------------------------
DROP TABLE IF EXISTS `oms_refund_order_item`;
CREATE TABLE `oms_refund_order_item` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `refund_order_id` int(10) NOT NULL COMMENT '退款单号',
  `product_sku_id` int(10) NOT NULL COMMENT '商品sku id',
  `refund_amount` decimal(10,2) NOT NULL COMMENT '退款金额',
  `pay_amount` decimal(10,2) NOT NULL COMMENT '实付金额',
  `reason` varchar(128) NOT NULL COMMENT '退款原因',
  `product_quantity` int(10) NOT NULL COMMENT '物品数量',
  `product_price` decimal(10,2) NOT NULL COMMENT '商品价格',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for pms_brand
-- ----------------------------
DROP TABLE IF EXISTS `pms_brand`;
CREATE TABLE `pms_brand` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(64) NOT NULL COMMENT '名称',
  `sort` int(10) NOT NULL COMMENT '排序',
  `logo` varchar(255) NOT NULL COMMENT '品牌logo',
  `big_pic` varchar(255) NOT NULL COMMENT '品牌大图',
  `show_status` tinyint(1) NOT NULL COMMENT '显示状态',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for pms_comment
-- ----------------------------
DROP TABLE IF EXISTS `pms_comment`;
CREATE TABLE `pms_comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `star` int(3) DEFAULT NULL COMMENT '评价星数：0->5',
  `member_ip` varchar(64) DEFAULT NULL COMMENT '评价的ip',
  `show_status` int(1) DEFAULT NULL,
  `product_attribute` varchar(255) DEFAULT NULL COMMENT '购买时的商品属性',
  `content` text,
  `pics` varchar(1000) DEFAULT NULL COMMENT '上传图片地址，以逗号隔开',
  `replay_count` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品评价表';

-- ----------------------------
-- Table structure for pms_comment_replay
-- ----------------------------
DROP TABLE IF EXISTS `pms_comment_replay`;
CREATE TABLE `pms_comment_replay` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `comment_id` bigint(20) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `create_time` datetime(3) DEFAULT NULL,
  `update_time` datetime(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品评价回复表';

-- ----------------------------
-- Table structure for pms_product
-- ----------------------------
DROP TABLE IF EXISTS `pms_product`;
CREATE TABLE `pms_product` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `brand_id` int(10) NOT NULL COMMENT '品牌id',
  `shop_id` int(10) NOT NULL COMMENT '店铺id',
  `category_id` int(10) NOT NULL COMMENT '商品分类id',
  `freight_template_id` int(10) NOT NULL COMMENT '运费模板id',
  `attribute_category_id` int(10) NOT NULL COMMENT '商品属性分类id',
  `name` varchar(64) NOT NULL COMMENT '名称',
  `sub_title` varchar(255) NOT NULL COMMENT '副标题',
  `pic` varchar(255) NOT NULL COMMENT '缩略图',
  `pics` varchar(512) NOT NULL COMMENT '图片轮播图',
  `price` int(1) NOT NULL COMMENT '价格',
  `delete_status` int(1) NOT NULL COMMENT '删除状态 0正常 1删除',
  `publish_status` int(1) NOT NULL COMMENT '上架下架',
  `new_status` int(1) NOT NULL COMMENT '是否新品 0 否 1是',
  `verify_status` int(1) NOT NULL COMMENT '审核状态：0->未审核；1->审核通过',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for pms_product_attribute
-- ----------------------------
DROP TABLE IF EXISTS `pms_product_attribute`;
CREATE TABLE `pms_product_attribute` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_attribute_category_id` bigint(20) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `select_type` int(1) DEFAULT NULL COMMENT '属性选择类型：0->唯一；1->单选；2->多选',
  `input_type` int(1) DEFAULT NULL COMMENT '属性录入方式：0->手工录入；1->从列表中选取',
  `input_list` varchar(255) DEFAULT NULL COMMENT '可选值列表，以逗号隔开',
  `sort` int(11) DEFAULT NULL COMMENT '排序字段：最高的可以单独上传图片',
  `filter_type` int(1) DEFAULT NULL COMMENT '分类筛选样式：1->普通；1->颜色',
  `search_type` int(1) DEFAULT NULL COMMENT '检索类型；0->不需要进行检索；1->关键字检索；2->范围检索',
  `related_status` int(1) DEFAULT NULL COMMENT '相同属性产品是否关联；0->不关联；1->关联',
  `hand_add_status` int(1) DEFAULT NULL COMMENT '是否支持手动新增；0->不支持；1->支持',
  `type` int(1) DEFAULT NULL COMMENT '属性的类型；0->规格；1->参数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8 COMMENT='商品属性参数表';

-- ----------------------------
-- Table structure for pms_product_attribute_category
-- ----------------------------
DROP TABLE IF EXISTS `pms_product_attribute_category`;
CREATE TABLE `pms_product_attribute_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `attribute_count` int(11) DEFAULT '0' COMMENT '属性数量',
  `param_count` int(11) DEFAULT '0' COMMENT '参数数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='产品属性分类表';

-- ----------------------------
-- Table structure for pms_product_attribute_value
-- ----------------------------
DROP TABLE IF EXISTS `pms_product_attribute_value`;
CREATE TABLE `pms_product_attribute_value` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) DEFAULT NULL,
  `product_attribute_id` bigint(20) DEFAULT NULL,
  `value` varchar(64) DEFAULT NULL COMMENT '手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=275 DEFAULT CHARSET=utf8 COMMENT='存储产品参数信息的表';

-- ----------------------------
-- Table structure for pms_product_category
-- ----------------------------
DROP TABLE IF EXISTS `pms_product_category`;
CREATE TABLE `pms_product_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '上机分类的编号：0表示一级分类',
  `name` varchar(64) DEFAULT NULL,
  `level` int(1) DEFAULT NULL COMMENT '分类级别：0->1级；1->2级',
  `product_count` int(11) DEFAULT NULL,
  `product_unit` varchar(64) DEFAULT NULL,
  `nav_status` int(1) DEFAULT NULL COMMENT '是否显示在导航栏：0->不显示；1->显示',
  `show_status` int(1) DEFAULT NULL COMMENT '显示状态：0->不显示；1->显示',
  `sort` int(11) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL COMMENT '图标',
  `keywords` varchar(255) DEFAULT NULL,
  `description` text COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8 COMMENT='产品分类';

-- ----------------------------
-- Table structure for pms_product_category_attribute_relation
-- ----------------------------
DROP TABLE IF EXISTS `pms_product_category_attribute_relation`;
CREATE TABLE `pms_product_category_attribute_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_category_id` bigint(20) DEFAULT NULL,
  `product_attribute_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）';

-- ----------------------------
-- Table structure for pms_product_sku_stock
-- ----------------------------
DROP TABLE IF EXISTS `pms_product_sku_stock`;
CREATE TABLE `pms_product_sku_stock` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `sku_code` varchar(64) NOT NULL COMMENT 'sku码',
  `product_id` int(10) NOT NULL COMMENT '商品id',
  `price` decimal(10,2) NOT NULL COMMENT '商品价格',
  `stock` int(10) NOT NULL COMMENT '库存',
  `sp_data` varchar(1024) NOT NULL COMMENT '商品销售属性',
  `lock_stock` int(10) NOT NULL COMMENT '锁定库存',
  `sale` int(10) NOT NULL COMMENT '销量',
  `pic` varchar(255) NOT NULL COMMENT '展示图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品sku库存表';

-- ----------------------------
-- Table structure for ums_admin
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin`;
CREATE TABLE `ums_admin` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `username` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL,
  `icon` varchar(512) NOT NULL,
  `email` varchar(100) NOT NULL COMMENT '手机号',
  `phone` varchar(64) NOT NULL COMMENT '手机号',
  `status` int(1) NOT NULL COMMENT '状态',
  `nick_name` varchar(64) NOT NULL COMMENT '昵称',
  `login_time` datetime(3) NOT NULL COMMENT '登录时间',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for ums_admin_role_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin_role_relation`;
CREATE TABLE `ums_admin_role_relation` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `admin_id` int(10) NOT NULL COMMENT 'admin id',
  `role_id` int(10) NOT NULL COMMENT '角色id',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for ums_menu
-- ----------------------------
DROP TABLE IF EXISTS `ums_menu`;
CREATE TABLE `ums_menu` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `parent_id` int(10) NOT NULL COMMENT '父级菜单id',
  `icon` varchar(255) NOT NULL COMMENT '图标',
  `level` int(10) NOT NULL COMMENT '菜单层级',
  `sort` int(10) NOT NULL COMMENT '排序',
  `name` varchar(64) NOT NULL COMMENT '菜单名称',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for ums_permission
-- ----------------------------
DROP TABLE IF EXISTS `ums_permission`;
CREATE TABLE `ums_permission` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `pid` int(10) NOT NULL COMMENT '父级id',
  `name` varchar(64) NOT NULL COMMENT '权限名',
  `value` varchar(64) NOT NULL COMMENT '权限值',
  `icon` varchar(64) NOT NULL COMMENT '图标',
  `type` int(1) NOT NULL COMMENT '类型',
  `url` varchar(255) NOT NULL COMMENT 'url',
  `status` int(1) NOT NULL COMMENT '状态',
  `sort` int(10) NOT NULL COMMENT '排序',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for ums_resource
-- ----------------------------
DROP TABLE IF EXISTS `ums_resource`;
CREATE TABLE `ums_resource` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `category_id` int(10) NOT NULL COMMENT '分类id',
  `name` varchar(64) NOT NULL COMMENT '资源名称',
  `url` varchar(64) NOT NULL COMMENT 'url',
  `description` varchar(64) NOT NULL COMMENT '描述',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for ums_resource_category
-- ----------------------------
DROP TABLE IF EXISTS `ums_resource_category`;
CREATE TABLE `ums_resource_category` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(64) NOT NULL COMMENT '名称',
  `sort` int(10) NOT NULL COMMENT '排序',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for ums_role
-- ----------------------------
DROP TABLE IF EXISTS `ums_role`;
CREATE TABLE `ums_role` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `name` varchar(64) NOT NULL COMMENT '名称',
  `description` varchar(255) NOT NULL COMMENT '描述',
  `status` int(1) NOT NULL COMMENT '角色状态',
  `sort` int(10) NOT NULL COMMENT '排序',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for ums_role_menu_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_role_menu_relation`;
CREATE TABLE `ums_role_menu_relation` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `role_id` int(10) NOT NULL,
  `menu_id` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for ums_role_permission_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_role_permission_relation`;
CREATE TABLE `ums_role_permission_relation` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `role_id` int(10) NOT NULL COMMENT '角色id',
  `permission_id` int(10) NOT NULL COMMENT '权限id',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for ums_role_resource_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_role_resource_relation`;
CREATE TABLE `ums_role_resource_relation` (
  `id` int(10) NOT NULL COMMENT '主键id',
  `role_id` int(10) NOT NULL COMMENT '角色id',
  `resource_id` int(10) NOT NULL COMMENT '资源id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='角色资源关系表';

-- ----------------------------
-- Table structure for ums_user
-- ----------------------------
DROP TABLE IF EXISTS `ums_user`;
CREATE TABLE `ums_user` (
  `id` int(11) NOT NULL COMMENT '主键id',
  `username` varchar(64) NOT NULL COMMENT '用户名',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `nickname` varchar(64) NOT NULL COMMENT '昵称',
  `phone` varchar(64) NOT NULL COMMENT '手机号',
  `status` int(1) NOT NULL COMMENT '用户状态',
  `icon` varchar(512) NOT NULL COMMENT '头像',
  `gender` int(1) NOT NULL,
  `birthday` date NOT NULL,
  `job` varchar(100) NOT NULL COMMENT '工作',
  `city_code` varchar(100) NOT NULL COMMENT '城市编码',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for ums_user_receive_address
-- ----------------------------
DROP TABLE IF EXISTS `ums_user_receive_address`;
CREATE TABLE `ums_user_receive_address` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户收货地址',
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `name` varchar(64) NOT NULL COMMENT '用户名',
  `phone` varchar(64) NOT NULL COMMENT '手机号',
  `default_status` int(1) NOT NULL COMMENT '是否默认 0 非 1是',
  `province` varchar(64) NOT NULL COMMENT '省',
  `city` varchar(64) NOT NULL COMMENT '市',
  `area` varchar(64) NOT NULL COMMENT '区',
  `detail_address` varchar(128) NOT NULL COMMENT '详细地址',
  `create_time` datetime(3) NOT NULL COMMENT '创建时间',
  `update_time` datetime(3) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;
