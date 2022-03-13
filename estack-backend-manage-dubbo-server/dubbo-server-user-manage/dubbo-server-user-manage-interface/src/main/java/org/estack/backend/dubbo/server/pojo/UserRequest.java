package org.estack.backend.dubbo.server.pojo;

import lombok.Data;
import lombok.experimental.Accessors;



/**
 * <p>
 *
 * </p>
 *
 * @author estack
 * @since 2022-01-16
 */
@Data
@Accessors(chain = true)
public class UserRequest{
    private String key;

    private int keyType;

    private String password;

}
