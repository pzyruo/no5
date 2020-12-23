package com.pzyruo.domain;

/**
 * @ClassName Items
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/22 21:06
 * @Version 1.0
 **/
public class Items {
    // item_id int
    private int itemId;
    // item_user_id int
    private Users itemUser;
    // item_goods_id int
    private Goods itemGoods;
    // item_goods_num int
    private int itemGoodsNum;
    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public Users getItemUser() {
        return itemUser;
    }
    public void setItemUser(Users itemUser) {
        this.itemUser = itemUser;
    }
    public Goods getItemGoods() {
        return itemGoods;
    }
    public void setItemGoods(Goods itemGoods) {
        this.itemGoods = itemGoods;
    }
    public int getItemGoodsNum() {
        return itemGoodsNum;
    }
    public void setItemGoodsNum(int itemGoodsNum) {
        this.itemGoodsNum = itemGoodsNum;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemId=" + itemId +
                ", itemUser=" + itemUser +
                ", itemGoods=" + itemGoods +
                ", itemGoodsNum=" + itemGoodsNum +
                '}';
    }
}