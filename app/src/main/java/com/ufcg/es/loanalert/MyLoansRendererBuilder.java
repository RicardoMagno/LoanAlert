package com.ufcg.es.loanalert;

import android.content.Context;

import com.pedrogomez.renderers.Renderer;
import com.pedrogomez.renderers.RendererBuilder;

import java.util.LinkedList;
import java.util.List;

class MyLoansRendererBuilder extends RendererBuilder<LoanEntry> {

    MyLoansRendererBuilder(Context context) {
        setPrototypes(getPrototypes(context));
    }

    @Override
    protected Class getPrototypeClass(LoanEntry guideItem) {
        return LoanEntryRenderer.class;
    }

    private List<Renderer<LoanEntry>> getPrototypes(Context context) {
        List<Renderer<LoanEntry>> prototypes = new LinkedList<>();
        prototypes.add(new LoanEntryRenderer(context));
        return prototypes;
    }

}
