package com.hanhwa.jsonparser.rsrv.localserver.model.command.cli;

public class RsrvSelectServiceImpl implements RsrvSelectService {
    private final RsrvSelect rsrvSelect;

    public RsrvSelectServiceImpl(RsrvSelect rsrvSelect) {
        this.rsrvSelect = rsrvSelect;
    }

    @Override
    public int serviceSelect() {
        int select = rsrvSelect.selectService();
        System.out.println(select);
        return select;
    }
}
