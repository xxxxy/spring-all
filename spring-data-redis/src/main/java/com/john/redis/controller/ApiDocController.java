/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-12-10</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.redis.controller;

/**
 * @author huangjy
 * @since v1.0
 */
public class ApiDocController {
    /**
     * @api {post} /carrierConfig 1.承运商配置表新增
     * @apiGroup CarrierConfig
     * @apiVersion 1.0.1
     * @apiDescription 承运商配置表
     * @apiParam {String} carrierRuleCode <code>RequestBody</code> 规则编码
     * @apiParam {String} whCode <code>RequestBody</code> 仓库编码
     * @apiParam {String} whName <code>RequestBody</code> 仓库名称
     * @apiParam {String} senderCode <code>RequestBody</code> 发货单位编码
     * @apiParam {String} senderName <code>RequestBody</code> 发货单位名称
     * @apiParam {String} receiverCode <code>RequestBody</code> 收货单位名称
     * @apiParam {String} receiverName <code>RequestBody</code> 收货单位名称
     * @apiParam {String} orderType <code>RequestBody</code> 订单类型
     * @apiParam {String} carrierCode <code>RequestBody</code> 承运商编码
     * @apiParam {String} carrierName <code>RequestBody</code> 承运商名称
     * @apiParam {String} sourceSystem <code>RequestBody</code> 来源系统,例如：菜鸟 ECM 奇门等
     * @apiParam {String} customerCode <code>RequestBody</code> 客户编码
     * @apiParam {String} customerName <code>RequestBody</code> 客户名称
     * @apiParam {Integer} scPosFlag <code>RequestBody</code> 商超标志: 1, 0
     * @apiParam {String} configStatus <code>RequestBody</code> 是否启用标识: Y,启用; N,禁用
     * @apiParamExample {json} Request:
     * POST /carrierConfig
     * {
     * "carrierRuleCode":"",
     * "whCode":"",
     * "whName":"",
     * "senderCode":"",
     * "senderName":"",
     * "receiverCode":"",
     * "receiverName":"",
     * "orderType":"",
     * "carrierCode":"",
     * "carrierName":"",
     * "sourceSystem":"",
     * "customerCode":"",
     * "customerName":"",
     * "scPosFlag":"",
     * "configStatus":"",
     * }
     * @apiSuccessExample {json} Success-Response:
     * HTTP/1.1 200 OK
     * {
     * "code": "0",
     * "desc": "Success",
     * "timestamp": "2019-01-14 14:29:51",
     * "data": null,
     * "success": true
     * }
     */
    public void testApiDoc() {
        System.out.println("test");
    }
}
