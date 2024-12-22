package org.gfg.JBDL_76_UserService.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SenderReceiverInfo {
    private String senderContact;
    private String receiverContact;
    private String msg;
    private double amount;
}