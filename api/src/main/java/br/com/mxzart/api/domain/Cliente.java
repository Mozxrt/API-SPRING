package br.com.mxzart.api.domain;

    public record Cliente (Long id, String nome, String slug, String state) {

        public void setId(Long id2) {
        }

}
