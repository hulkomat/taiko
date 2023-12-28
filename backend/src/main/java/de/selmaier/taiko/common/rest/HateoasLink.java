package de.selmaier.taiko.common.rest;

import java.util.List;

public record HateoasLink(String rel, String href, String action, List<String> types) {
    
}
