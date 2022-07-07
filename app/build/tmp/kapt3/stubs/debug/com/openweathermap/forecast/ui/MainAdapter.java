package com.openweathermap.forecast.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/openweathermap/forecast/ui/MainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/openweathermap/forecast/ui/MainAdapter$ViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/openweathermap/forecast/models/Dummy;", "(Landroid/content/Context;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class MainAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.openweathermap.forecast.ui.MainAdapter.ViewHolder> {
    private final android.content.Context context = null;
    private java.util.List<com.openweathermap.forecast.models.Dummy> dataList;
    
    public MainAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.openweathermap.forecast.models.Dummy> dataList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.openweathermap.forecast.ui.MainAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.openweathermap.forecast.ui.MainAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/openweathermap/forecast/ui/MainAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemRowBinding", "Lcom/openweathermap/forecast/databinding/ItemLayoutBinding;", "(Lcom/openweathermap/forecast/ui/MainAdapter;Lcom/openweathermap/forecast/databinding/ItemLayoutBinding;)V", "binding", "getBinding", "()Lcom/openweathermap/forecast/databinding/ItemLayoutBinding;", "setBinding", "(Lcom/openweathermap/forecast/databinding/ItemLayoutBinding;)V", "bind", "", "obj", "Lcom/openweathermap/forecast/models/Dummy;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.openweathermap.forecast.databinding.ItemLayoutBinding itemRowBinding;
        @org.jetbrains.annotations.NotNull()
        private com.openweathermap.forecast.databinding.ItemLayoutBinding binding;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.openweathermap.forecast.databinding.ItemLayoutBinding itemRowBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.openweathermap.forecast.databinding.ItemLayoutBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.openweathermap.forecast.databinding.ItemLayoutBinding p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.openweathermap.forecast.models.Dummy obj) {
        }
    }
}