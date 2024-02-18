package dev.practice.order.domain.partner;

public interface PartnerService {
    // Command : 명령
    // Criteria : 조회 옵션
    PartnerInfo registerPartner(PartnerCommand command);
    PartnerInfo getPartnerInfo(String partnerToken);
    PartnerInfo enablePartner(String partnerToken);
    PartnerInfo disablePartner(String partnerToken);
}
