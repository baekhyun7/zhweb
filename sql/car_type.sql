/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : acloud

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 18/02/2020 13:41:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for car_type
-- ----------------------------
DROP TABLE IF EXISTS `car_type`;
CREATE TABLE `car_type`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of car_type
-- ----------------------------
INSERT INTO `car_type` VALUES ('1', '大众');
INSERT INTO `car_type` VALUES ('10', '雷诺');
INSERT INTO `car_type` VALUES ('100', '科尼赛克');
INSERT INTO `car_type` VALUES ('101', '开瑞');
INSERT INTO `car_type` VALUES ('102', '威麟');
INSERT INTO `car_type` VALUES ('103', '瑞麒');
INSERT INTO `car_type` VALUES ('108', '广汽吉奥');
INSERT INTO `car_type` VALUES ('109', 'KTM');
INSERT INTO `car_type` VALUES ('11', '菲亚特');
INSERT INTO `car_type` VALUES ('110', '一汽');
INSERT INTO `car_type` VALUES ('111', '野马汽车');
INSERT INTO `car_type` VALUES ('112', 'GMC');
INSERT INTO `car_type` VALUES ('113', '东风风神');
INSERT INTO `car_type` VALUES ('114', '五菱汽车');
INSERT INTO `car_type` VALUES ('115', 'Gumpert');
INSERT INTO `car_type` VALUES ('116', '光冈');
INSERT INTO `car_type` VALUES ('117', 'AC Schnitzer');
INSERT INTO `car_type` VALUES ('118', 'Lorinser');
INSERT INTO `car_type` VALUES ('119', '江铃');
INSERT INTO `car_type` VALUES ('12', '现代');
INSERT INTO `car_type` VALUES ('120', '宝骏');
INSERT INTO `car_type` VALUES ('121', '蓝旗亚');
INSERT INTO `car_type` VALUES ('122', '启辰');
INSERT INTO `car_type` VALUES ('124', '理念');
INSERT INTO `car_type` VALUES ('125', 'Tramontana');
INSERT INTO `car_type` VALUES ('127', 'SPIRRA');
INSERT INTO `car_type` VALUES ('129', '迈凯伦');
INSERT INTO `car_type` VALUES ('13', '标致');
INSERT INTO `car_type` VALUES ('130', '纳智捷');
INSERT INTO `car_type` VALUES ('132', 'Fisker');
INSERT INTO `car_type` VALUES ('133', '特斯拉');
INSERT INTO `car_type` VALUES ('134', 'ABT');
INSERT INTO `car_type` VALUES ('135', 'TVR');
INSERT INTO `car_type` VALUES ('136', 'Noble');
INSERT INTO `car_type` VALUES ('137', 'Scion');
INSERT INTO `car_type` VALUES ('138', 'SSC');
INSERT INTO `car_type` VALUES ('139', '凯佰赫');
INSERT INTO `car_type` VALUES ('14', '本田');
INSERT INTO `car_type` VALUES ('140', '巴博斯');
INSERT INTO `car_type` VALUES ('141', '福迪');
INSERT INTO `car_type` VALUES ('142', '东风小康');
INSERT INTO `car_type` VALUES ('143', '北汽威旺');
INSERT INTO `car_type` VALUES ('144', '依维柯');
INSERT INTO `car_type` VALUES ('145', '金龙');
INSERT INTO `car_type` VALUES ('146', '欧朗');
INSERT INTO `car_type` VALUES ('147', '首望');
INSERT INTO `car_type` VALUES ('15', '宝马');
INSERT INTO `car_type` VALUES ('150', '海格');
INSERT INTO `car_type` VALUES ('151', '九龙');
INSERT INTO `car_type` VALUES ('152', '观致');
INSERT INTO `car_type` VALUES ('153', 'Zenvo');
INSERT INTO `car_type` VALUES ('154', '北汽制造');
INSERT INTO `car_type` VALUES ('155', '上汽大通');
INSERT INTO `car_type` VALUES ('156', '卡尔森');
INSERT INTO `car_type` VALUES ('157', 'Dacia');
INSERT INTO `car_type` VALUES ('159', '沃克斯豪尔');
INSERT INTO `car_type` VALUES ('161', '腾势');
INSERT INTO `car_type` VALUES ('162', '思铭');
INSERT INTO `car_type` VALUES ('163', '长安欧尚');
INSERT INTO `car_type` VALUES ('164', '恒天');
INSERT INTO `car_type` VALUES ('165', '东风风行');
INSERT INTO `car_type` VALUES ('167', '五十铃');
INSERT INTO `car_type` VALUES ('168', '摩根');
INSERT INTO `car_type` VALUES ('169', 'DS');
INSERT INTO `car_type` VALUES ('170', 'Hennessey');
INSERT INTO `car_type` VALUES ('171', 'Conquest');
INSERT INTO `car_type` VALUES ('172', '保斐利');
INSERT INTO `car_type` VALUES ('173', '北汽绅宝');
INSERT INTO `car_type` VALUES ('174', '如虎');
INSERT INTO `car_type` VALUES ('175', '金旅');
INSERT INTO `car_type` VALUES ('176', '弗那萨利');
INSERT INTO `car_type` VALUES ('177', 'FM Auto');
INSERT INTO `car_type` VALUES ('178', '上海');
INSERT INTO `car_type` VALUES ('181', '哈弗');
INSERT INTO `car_type` VALUES ('182', '之诺');
INSERT INTO `car_type` VALUES ('183', '朗世');
INSERT INTO `car_type` VALUES ('184', '华骐');
INSERT INTO `car_type` VALUES ('185', '新凯');
INSERT INTO `car_type` VALUES ('186', '佩奇奥');
INSERT INTO `car_type` VALUES ('187', '东风风度');
INSERT INTO `car_type` VALUES ('188', 'Icona');
INSERT INTO `car_type` VALUES ('189', 'Caterham');
INSERT INTO `car_type` VALUES ('19', '荣威');
INSERT INTO `car_type` VALUES ('190', 'GAZ');
INSERT INTO `car_type` VALUES ('191', '开利');
INSERT INTO `car_type` VALUES ('192', '潍柴英致');
INSERT INTO `car_type` VALUES ('193', 'Rinspeed');
INSERT INTO `car_type` VALUES ('196', '成功汽车');
INSERT INTO `car_type` VALUES ('197', '福汽启腾');
INSERT INTO `car_type` VALUES ('198', 'DMC');
INSERT INTO `car_type` VALUES ('199', '卡威');
INSERT INTO `car_type` VALUES ('20', '名爵');
INSERT INTO `car_type` VALUES ('200', '塔塔');
INSERT INTO `car_type` VALUES ('202', '泰卡特');
INSERT INTO `car_type` VALUES ('203', '北汽幻速');
INSERT INTO `car_type` VALUES ('204', '陆地方舟');
INSERT INTO `car_type` VALUES ('205', '赛麟');
INSERT INTO `car_type` VALUES ('206', '知豆');
INSERT INTO `car_type` VALUES ('207', '谷歌');
INSERT INTO `car_type` VALUES ('208', '北汽新能源');
INSERT INTO `car_type` VALUES ('209', '佳跃');
INSERT INTO `car_type` VALUES ('210', '江铃集团轻汽');
INSERT INTO `car_type` VALUES ('211', 'Elemental');
INSERT INTO `car_type` VALUES ('213', '南京金龙');
INSERT INTO `car_type` VALUES ('214', '凯翼');
INSERT INTO `car_type` VALUES ('215', '雷丁');
INSERT INTO `car_type` VALUES ('217', 'Datsun');
INSERT INTO `car_type` VALUES ('219', '康迪全球鹰');
INSERT INTO `car_type` VALUES ('22', '中华');
INSERT INTO `car_type` VALUES ('220', '华颂');
INSERT INTO `car_type` VALUES ('221', '安凯客车');
INSERT INTO `car_type` VALUES ('222', '乔治·巴顿');
INSERT INTO `car_type` VALUES ('225', '领志');
INSERT INTO `car_type` VALUES ('226', '斯太尔');
INSERT INTO `car_type` VALUES ('227', 'RENOVO');
INSERT INTO `car_type` VALUES ('228', 'nanoFLOWCELL');
INSERT INTO `car_type` VALUES ('229', 'MAGNA');
INSERT INTO `car_type` VALUES ('230', 'GTA');
INSERT INTO `car_type` VALUES ('231', '宝沃');
INSERT INTO `car_type` VALUES ('232', '御捷');
INSERT INTO `car_type` VALUES ('233', 'W Motors');
INSERT INTO `car_type` VALUES ('234', 'Donkervoort');
INSERT INTO `car_type` VALUES ('235', '前途');
INSERT INTO `car_type` VALUES ('236', 'TOROIDION');
INSERT INTO `car_type` VALUES ('237', '华利');
INSERT INTO `car_type` VALUES ('239', 'Rezvani');
INSERT INTO `car_type` VALUES ('24', '哈飞');
INSERT INTO `car_type` VALUES ('240', '霍顿');
INSERT INTO `car_type` VALUES ('241', 'LOCAL MOTORS');
INSERT INTO `car_type` VALUES ('242', '欧联');
INSERT INTO `car_type` VALUES ('243', '游侠');
INSERT INTO `car_type` VALUES ('244', '拉达');
INSERT INTO `car_type` VALUES ('245', '华凯');
INSERT INTO `car_type` VALUES ('247', 'YAMAHA');
INSERT INTO `car_type` VALUES ('248', 'Faraday Future');
INSERT INTO `car_type` VALUES ('249', 'VLF Automotive');
INSERT INTO `car_type` VALUES ('25', '吉利汽车');
INSERT INTO `car_type` VALUES ('250', 'Mahindra');
INSERT INTO `car_type` VALUES ('251', 'Arash');
INSERT INTO `car_type` VALUES ('252', 'Rimac');
INSERT INTO `car_type` VALUES ('253', 'Apollo');
INSERT INTO `car_type` VALUES ('254', 'Radical');
INSERT INTO `car_type` VALUES ('255', '泰克鲁斯·腾风');
INSERT INTO `car_type` VALUES ('257', '宾尼法利纳');
INSERT INTO `car_type` VALUES ('258', 'SIN CARS');
INSERT INTO `car_type` VALUES ('259', '东风风光');
INSERT INTO `car_type` VALUES ('26', '奇瑞');
INSERT INTO `car_type` VALUES ('260', '华泰新能源');
INSERT INTO `car_type` VALUES ('261', '雷诺三星');
INSERT INTO `car_type` VALUES ('263', '驭胜');
INSERT INTO `car_type` VALUES ('264', '长江EV');
INSERT INTO `car_type` VALUES ('265', 'LeSEE');
INSERT INTO `car_type` VALUES ('266', '车和家');
INSERT INTO `car_type` VALUES ('267', '汉腾汽车');
INSERT INTO `car_type` VALUES ('268', 'Mazzanti');
INSERT INTO `car_type` VALUES ('269', 'SWM斯威汽车');
INSERT INTO `car_type` VALUES ('27', '北京');
INSERT INTO `car_type` VALUES ('270', '江铃集团新能源');
INSERT INTO `car_type` VALUES ('271', '比速汽车');
INSERT INTO `car_type` VALUES ('272', 'ARCFOX');
INSERT INTO `car_type` VALUES ('273', '艾康尼克');
INSERT INTO `car_type` VALUES ('274', 'Inferno');
INSERT INTO `car_type` VALUES ('275', '小鹏汽车');
INSERT INTO `car_type` VALUES ('276', 'ALPINA');
INSERT INTO `car_type` VALUES ('277', 'GLM');
INSERT INTO `car_type` VALUES ('279', '领克');
INSERT INTO `car_type` VALUES ('280', '电咖');
INSERT INTO `car_type` VALUES ('281', '奇点汽车');
INSERT INTO `car_type` VALUES ('282', '福田乘用车');
INSERT INTO `car_type` VALUES ('283', 'WEY');
INSERT INTO `car_type` VALUES ('284', '蔚来');
INSERT INTO `car_type` VALUES ('285', 'Lucid');
INSERT INTO `car_type` VALUES ('286', '云度');
INSERT INTO `car_type` VALUES ('287', 'Vanda Electric');
INSERT INTO `car_type` VALUES ('288', 'Italdesign');
INSERT INTO `car_type` VALUES ('289', '祺智');
INSERT INTO `car_type` VALUES ('290', '正道汽车');
INSERT INTO `car_type` VALUES ('291', '威马汽车');
INSERT INTO `car_type` VALUES ('292', 'Agile Automotive');
INSERT INTO `car_type` VALUES ('293', '昶洧');
INSERT INTO `car_type` VALUES ('294', '长安轻型车');
INSERT INTO `car_type` VALUES ('295', 'NEVS');
INSERT INTO `car_type` VALUES ('296', '瑞驰新能源');
INSERT INTO `car_type` VALUES ('297', '君马汽车');
INSERT INTO `car_type` VALUES ('299', '长安跨越');
INSERT INTO `car_type` VALUES ('3', '丰田');
INSERT INTO `car_type` VALUES ('301', '北汽道达');
INSERT INTO `car_type` VALUES ('302', '拜腾');
INSERT INTO `car_type` VALUES ('303', 'ATS');
INSERT INTO `car_type` VALUES ('304', '国金汽车');
INSERT INTO `car_type` VALUES ('306', '鑫源');
INSERT INTO `car_type` VALUES ('307', '裕路');
INSERT INTO `car_type` VALUES ('308', 'Polestar');
INSERT INTO `car_type` VALUES ('309', '合众');
INSERT INTO `car_type` VALUES ('310', 'Aria');
INSERT INTO `car_type` VALUES ('312', '庆铃汽车');
INSERT INTO `car_type` VALUES ('313', '广汽新能源');
INSERT INTO `car_type` VALUES ('315', 'Jannarelly');
INSERT INTO `car_type` VALUES ('316', '绿驰');
INSERT INTO `car_type` VALUES ('317', '云雀汽车');
INSERT INTO `car_type` VALUES ('318', '零跑汽车');
INSERT INTO `car_type` VALUES ('319', '捷途');
INSERT INTO `car_type` VALUES ('32', '东风');
INSERT INTO `car_type` VALUES ('320', 'LEVC');
INSERT INTO `car_type` VALUES ('321', 'Corbellati');
INSERT INTO `car_type` VALUES ('322', 'Cupra');
INSERT INTO `car_type` VALUES ('323', '拉共达');
INSERT INTO `car_type` VALUES ('324', '新特汽车');
INSERT INTO `car_type` VALUES ('325', 'SF MOTORS');
INSERT INTO `car_type` VALUES ('327', '爱驰');
INSERT INTO `car_type` VALUES ('328', '刺猬汽车');
INSERT INTO `car_type` VALUES ('329', '广汽集团');
INSERT INTO `car_type` VALUES ('33', '奥迪');
INSERT INTO `car_type` VALUES ('330', 'SOL');
INSERT INTO `car_type` VALUES ('331', '欧拉');
INSERT INTO `car_type` VALUES ('332', '欧尚汽车');
INSERT INTO `car_type` VALUES ('34', '阿尔法·罗密欧');
INSERT INTO `car_type` VALUES ('35', '阿斯顿·马丁');
INSERT INTO `car_type` VALUES ('36', '奔驰');
INSERT INTO `car_type` VALUES ('37', '布加迪');
INSERT INTO `car_type` VALUES ('38', '别克');
INSERT INTO `car_type` VALUES ('39', '宾利');
INSERT INTO `car_type` VALUES ('40', '保时捷');
INSERT INTO `car_type` VALUES ('41', '道奇');
INSERT INTO `car_type` VALUES ('42', '法拉利');
INSERT INTO `car_type` VALUES ('43', '悍马');
INSERT INTO `car_type` VALUES ('44', '捷豹');
INSERT INTO `car_type` VALUES ('45', 'smart');
INSERT INTO `car_type` VALUES ('46', 'Jeep');
INSERT INTO `car_type` VALUES ('47', '凯迪拉克');
INSERT INTO `car_type` VALUES ('48', '兰博基尼');
INSERT INTO `car_type` VALUES ('49', '路虎');
INSERT INTO `car_type` VALUES ('50', '路特斯');
INSERT INTO `car_type` VALUES ('51', '林肯');
INSERT INTO `car_type` VALUES ('52', '雷克萨斯');
INSERT INTO `car_type` VALUES ('53', '铃木');
INSERT INTO `car_type` VALUES ('54', '劳斯莱斯');
INSERT INTO `car_type` VALUES ('55', '迈巴赫');
INSERT INTO `car_type` VALUES ('56', 'MINI');
INSERT INTO `car_type` VALUES ('57', '玛莎拉蒂');
INSERT INTO `car_type` VALUES ('58', '马自达');
INSERT INTO `car_type` VALUES ('59', '欧宝');
INSERT INTO `car_type` VALUES ('60', '讴歌');
INSERT INTO `car_type` VALUES ('61', '帕加尼');
INSERT INTO `car_type` VALUES ('62', '起亚');
INSERT INTO `car_type` VALUES ('63', '日产');
INSERT INTO `car_type` VALUES ('64', '萨博');
INSERT INTO `car_type` VALUES ('65', '斯巴鲁');
INSERT INTO `car_type` VALUES ('66', '世爵');
INSERT INTO `car_type` VALUES ('67', '斯柯达');
INSERT INTO `car_type` VALUES ('68', '三菱');
INSERT INTO `car_type` VALUES ('69', '双龙');
INSERT INTO `car_type` VALUES ('70', '沃尔沃');
INSERT INTO `car_type` VALUES ('71', '雪佛兰');
INSERT INTO `car_type` VALUES ('72', '雪铁龙');
INSERT INTO `car_type` VALUES ('73', '英菲尼迪');
INSERT INTO `car_type` VALUES ('74', '中兴');
INSERT INTO `car_type` VALUES ('75', '比亚迪');
INSERT INTO `car_type` VALUES ('76', '长安');
INSERT INTO `car_type` VALUES ('77', '长城');
INSERT INTO `car_type` VALUES ('78', '猎豹汽车');
INSERT INTO `car_type` VALUES ('79', '北汽昌河');
INSERT INTO `car_type` VALUES ('8', '福特');
INSERT INTO `car_type` VALUES ('80', '力帆汽车');
INSERT INTO `car_type` VALUES ('81', '东南');
INSERT INTO `car_type` VALUES ('82', '广汽传祺');
INSERT INTO `car_type` VALUES ('83', '金杯');
INSERT INTO `car_type` VALUES ('84', '江淮');
INSERT INTO `car_type` VALUES ('85', '华普');
INSERT INTO `car_type` VALUES ('86', '海马');
INSERT INTO `car_type` VALUES ('87', '华泰');
INSERT INTO `car_type` VALUES ('88', '陆风');
INSERT INTO `car_type` VALUES ('89', '莲花汽车');
INSERT INTO `car_type` VALUES ('9', '克莱斯勒');
INSERT INTO `car_type` VALUES ('90', '双环');
INSERT INTO `car_type` VALUES ('91', '红旗');
INSERT INTO `car_type` VALUES ('92', '大发');
INSERT INTO `car_type` VALUES ('93', '永源');
INSERT INTO `car_type` VALUES ('94', '众泰');
INSERT INTO `car_type` VALUES ('95', '奔腾');
INSERT INTO `car_type` VALUES ('96', '福田');
INSERT INTO `car_type` VALUES ('97', '黄海');
INSERT INTO `car_type` VALUES ('98', '西雅特');
INSERT INTO `car_type` VALUES ('99', '威兹曼');

SET FOREIGN_KEY_CHECKS = 1;
