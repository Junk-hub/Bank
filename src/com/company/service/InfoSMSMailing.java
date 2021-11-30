package com.company.service;

public class InfoSMSMailing extends OptionDecorator{

    public InfoSMSMailing(Service service) {
        super(service, "Рассылка информации о счете по СМС", 30);
    }
}
