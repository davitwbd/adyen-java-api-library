package com.adyen.service.resource.notification;

import java.util.Arrays;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.Resource;

public class CreateNotificationConfiguration extends Resource {

    public CreateNotificationConfiguration(Service service) {
        super(service,
              service.getClient().getConfig().getMarketPayEndpoint() + "/Notification/" + Client.MARKETPAY_API_VERSION + "/createNotificationConfiguration",
              Arrays.asList(
                      "configurationDetails"
              )
        );
    }
}
