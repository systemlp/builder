package com.lp.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 单例建造类，用于批量生产手机<br>
 * 〈功能详细描述〉
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class PhoneBuilder {

    private PhoneBuilder() {

    }

    private static class PhoneBuilderFactory {
        private static PhoneBuilder instance = new PhoneBuilder();
    }

    public static PhoneBuilder getInatance() {
        return PhoneBuilderFactory.instance;
    }

    private List<Phone> phoneList = new ArrayList<Phone>();

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void produceIPhone(int number) {
        for (int i = 0; i < number; i++) {
            phoneList.add(new IPhone());
        }
    }

    public void produceSamsung(int number) {
        for (int i = 0; i < number; i++) {
            phoneList.add(new Samsung());
        }
    }

}
