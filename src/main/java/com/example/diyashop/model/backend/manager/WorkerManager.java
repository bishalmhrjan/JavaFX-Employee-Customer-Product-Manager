package com.example.diyashop.model.backend.manager;


import com.example.diyashop.model.entity.Worker;

import java.util.UUID;

public class WorkerManager extends GenericManager<Worker, UUID> {
    public WorkerManager() {
        super(Worker.class);
    }
}
